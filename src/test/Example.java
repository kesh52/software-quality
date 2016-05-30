package test;

import model.Article;
import model.Image;
import model.NewsCollection;
import output.Content;
import output.FormatingStrategy;
import output.InformationList;

public class Example {

    public static void main(String[] args) {
        NewsCollection masterCollection = new NewsCollection("Sports");
        masterCollection.addCollection(new NewsCollection("Tennis")
                .addArticle(new Article("Aaron Carter wins Wimbledon","ups"))
                .addImage(new Image("The Becker-Faust", 800, 600, "zdf"))
                .addImage(new Image("Aaron Carter smiling", 1280, 720, "anonymous"))
                .addArticle(new Article("Greenpeace riots at Wimbledon finals: "
                        + "the grass is always greener on the artificial side", "dpd")))
        .addCollection(new NewsCollection("Formula 1")
                .addArticle(new Article("Mika Häkkinen back on track", "pdf"))
                .addArticle(new Article("Alonso driving wrong-way at the Monaco Grand Prix", "ard")))
        .addCollection(new NewsCollection("Soccer")
                .addCollection(new NewsCollection("German Soccer")
                        .addImage(new Image("Rooney parody", 800, 600, "anonymous"))
                        .addArticle(new Article("Paul Simon prays for Luis Suarez's soul", "gps"))
                .addCollection(new NewsCollection("UK Soccer")
                        .addArticle(new Article("Oliver Kahn signs trainer contract at Schalke 04", "ddr")))));

        FormatingStrategy printInformationList = new InformationList();
        printInformationList.print(masterCollection);
        System.out.println("\n=================\n");
        FormatingStrategy printContents = new Content();
        printContents.print(masterCollection);
    }
}
