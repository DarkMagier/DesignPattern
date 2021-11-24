package com.DesignPattern.Flyweight;

public class Client {
    public static void main(String[] args) {


        WebSiteFactory webSiteFactory = new WebSiteFactory();
        User user1 = new User("tom");
        WebSite website1 = webSiteFactory.getWebsiteConcrete("news");
        website1.use(user1);

        User user2 = new User("jacky");
        WebSite website2 = webSiteFactory.getWebsiteConcrete("blog");
        website2.use(user2);

        User user3 = new User("tom");
        WebSite website3 = webSiteFactory.getWebsiteConcrete("news");
        website3.use(user3);

        User user4 = new User("jacky");
        WebSite website4 = webSiteFactory.getWebsiteConcrete("blog");
        website4.use(user4);

        System.out.println("網站數量："+webSiteFactory.getWebsiteCount());
    }
}
