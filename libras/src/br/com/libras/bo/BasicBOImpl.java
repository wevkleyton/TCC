package br.com.libras.bo;

import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileLockInterruptionException;

public class BasicBOImpl {
    

	public void updateImagem() {
		
		try {
			File file = new File("");
			FileInputStream fileInputStream = new FileInputStream(file);
//			update mytable set avatarImg = pg_read_file('/Users/myUser/profile.png')::bytea where userid=5;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
