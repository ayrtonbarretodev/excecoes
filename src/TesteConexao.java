public class TesteConexao {
    public static void main(String[] args) {

//        Conexao con = null;
//        try {
//            con = new Conexao();
//            con.leDados();
//        } catch (IllegalStateException ex) {
//            System.out.println("Deu erro na conexão");
//        } finally {
//            if (con != null) {
//                con.close();
//            }
//        }

        /* Modo mais atual de realizar a implementação do código acima*/

        try(Conexao conexao = new Conexao()){
            conexao.leDados();
        }catch (IllegalStateException ex){
            System.out.println("Deu erro na conexao");
        }

        /* No caso acima, também funcionaria se deixassemos só o bloco try, pois ele funcionaria como se fosse um try ... finally, porém
        não trataria a exceção */
    }
}
