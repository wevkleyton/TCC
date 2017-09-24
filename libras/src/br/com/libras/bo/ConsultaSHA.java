package br.com.libras.bo;

import java.security.MessageDigest;

/***
 *  @author wev  kleyton
 *   Data : 01/09/2017
 *   Descrição da classe: Classe que testa o caracter da senha
 */
public interface ConsultaSHA {

    /**
     *
     * @param password
     * @return
     */
    public static String geraHasSenha(String password){

        String senha = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte[] result = md.digest(password.getBytes());
            StringBuffer stringBuffer = new StringBuffer();
            for(int i = 0; i < result.length ; i++){
                stringBuffer.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
            }

            senha = stringBuffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return senha;
    }
}
