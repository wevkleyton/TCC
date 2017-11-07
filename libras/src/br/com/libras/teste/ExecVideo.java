package br.com.libras.teste;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.sun.jna.NativeLibrary;
import uk.co.caprica.vlcj.player.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;
import uk.co.caprica.vlcj.runtime.windows.WindowsRuntimeUtil;

public class ExecVideo {

	public ExecVideo() {
	        registerLibrary();
	    }

	/**
	 * Executa arquivo de audio/video
	 */
	public void play(final String filename) {
		final Canvas videoSurface = new Canvas();
		final Frame frame = buildFrame(videoSurface);
		final List vlcArgs = new ArrayList();

		configureParameters(vlcArgs);

		final EmbeddedMediaPlayer mediaPlayer = createPlayer(vlcArgs, videoSurface);
		mediaPlayer.playMedia(filename);
	}

	/**
	 * Importante: Informa onde está a libvlc, que contem as funções nativas de
	 * manipulacao do player
	 * 
	 * Windows: libvlc.dll Linux: libvlc.so
	 */
	private void registerLibrary() {
		//NativeLibrary.addSearchPath("libvlc", "C:\\Arquivos de programas\\VideoLAN\\VLC\\");
		NativeLibrary.addSearchPath("libvlc.so.5", "/usr/lib/");

		// Windows 64 bits:
		// NativeLibrary.addSearchPath("libvlc", "c:\\Program Files
		// (x86)\\VideoLAN\\VLC\\");
	}

	/**
	 * Cria frame onde será exibido o filme
	 */
	private Frame buildFrame(final Canvas videoSurface) {
		final Frame f = new Frame("Test Player");
		f.setSize(300, 300);
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setLayout(new BorderLayout());
		f.add(videoSurface, BorderLayout.CENTER);
		f.setVisible(true);
		return f;
	}

	/**
	 * Configura parametros do VLC
	 */
	private void configureParameters(final List vlcArgs) {
		vlcArgs.add("--no-plugins-cache");
		vlcArgs.add("--no-video-title-show");
		vlcArgs.add("--no-snapshot-preview");

		// Importante, se esse parametro nao for configurado no Windows, a aplicacao nao
		// funcionara
		if (RuntimeUtil.isWindows()) {
			vlcArgs.add("--plugin-path=" + WindowsRuntimeUtil.getVlcInstallDir() + "\\plugins");
		}
	}

	/**
	 * Constroi o player
	 */
	private EmbeddedMediaPlayer createPlayer(final List vlcArgs, final Canvas videoSurface) {
		final MediaPlayerFactory factory = new MediaPlayerFactory((String[]) vlcArgs.toArray(new String[vlcArgs.size()]));
		EmbeddedMediaPlayer mediaPlayer = factory.newMediaPlayer(null);
		mediaPlayer.setVideoSurface(videoSurface);
		return mediaPlayer;
	}

	public static void main(String[] args) throws InterruptedException {
		ExecVideo player = new ExecVideo();
		// Pode ser MP4, AVI, MOV, MKV, WMA, MPG, MP3, WAV, etc.
		player.play("/tmp/açai.mp4");

		// Aguarda janela do player ser fechada
		//Thread.currentThread().join();
	}
}
