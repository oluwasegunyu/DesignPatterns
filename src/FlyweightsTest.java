public class FlyweightsTest {
    public static void main(String... args){
        WebSiteFactory f = new WebSiteFactory();

        WebSite fx = f.getWebSiteCategory("产品展示");
        fx.use(new User("小菜"));

        WebSite fy = f.getWebSiteCategory("产品展示");
        fy.use(new User("大鸟"));

        WebSite fz = f.getWebSiteCategory("产品展示");
        fz.use(new User("娇娇"));

        WebSite fl = f.getWebSiteCategory("博客");
        fl.use(new User("老玩童"));

        WebSite fm = f.getWebSiteCategory("博客");
        fm.use(new User("大仙"));

        WebSite fn = f.getWebSiteCategory("博客");
        fn.use(new User("南海"));

        System.out.println("网站数量： " + f.getWebSiteCount());
    }
}
