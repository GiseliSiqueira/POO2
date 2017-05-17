
package observadorposterous;

/**
 *
 * @author Giseli
 */
public class ObservadorPosterous {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Blog blog = new Blog("loginblog@blog.com");
        Facebook facebook = new Facebook("loginfacebook@facebook.com");
        Twitter twitter = new Twitter("logintwitter@twitter.com");
        
        CaixaDePublicacao cxPublicacao = new CaixaDePublicacao();
        cxPublicacao.addObserver(blog);
        cxPublicacao.addObserver(facebook);
        cxPublicacao.addObserver(twitter);
        
        cxPublicacao.setNovaMensagem("Nova Mensagem!");
    }
    
}
