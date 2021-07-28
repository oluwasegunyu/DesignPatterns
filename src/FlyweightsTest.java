public class FlyweightsTest {
    public static void main(String... args){
        WebSiteFactory f = new WebSiteFactory();

        WebSite fx = f.getWebSiteCategory("产品展示");
        fx.use();

        WebSite fy = f.getWebSiteCategory("产品展示");
        fy.use();

        WebSite fz = f.getWebSiteCategory("产品展示");
        fz.use();

        WebSite fl = f.getWebSiteCategory("博客");
        fl.use();

        WebSite fm = f.getWebSiteCategory("博客");
        fm.use();

        WebSite fn = f.getWebSiteCategory("博客");
        fn.use();

        System.out.println("网站数量： " + f.getWebSiteCount());
    }
}
