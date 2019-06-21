package co.com.designpatterns.factory;

/**
 * esta es la clase encargada de construir
 */
public class WebSiteFactory {

    /**
     * con este método construimos un webSite dependiendo del tipo y así no hacemos visibles
     * las clases necesarias
     *
     * @param siteType
     * @return
     */
    public static Website getWebsite(WebSiteType siteType) {
        switch (siteType) {
            case BLOG:
                return new Blog();
            case SHOP:
                return new Shop();
            default:
                return null;
        }
    }
}
