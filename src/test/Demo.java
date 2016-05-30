package test;

import model.Article;
import model.AtomicContent;
import model.CompositeContent;
import model.Image;
import model.NewsCollection;
import visitor.Contents;
import visitor.InformationList;
import visitor.Visitor;

public class Demo {

    public static void main(String[] args) {
        CompositeContent sportsNews = new NewsCollection("Sports");
        CompositeContent tennisNews = new NewsCollection("Tennis");
        CompositeContent formula1 = new NewsCollection("Formula 1");
        CompositeContent soccer = new NewsCollection("Soccer");
        CompositeContent germanSoccer = new NewsCollection("German Soccer");
        CompositeContent ukSoccer = new NewsCollection("UK Soccer");

        AtomicContent rooneyParodyImage = new Image("Rooney parody", 800, 600, "anonymous");
        germanSoccer.addElement(rooneyParodyImage);

        sportsNews.addElement(tennisNews);
        sportsNews.addElement(formula1);
        sportsNews.addElement(soccer);
        soccer.addElement(germanSoccer);
        soccer.addElement(ukSoccer);

        CompositeContent article1 = new Article("Aaron Carter wins Wimbledon","ups");
        AtomicContent image1 = new Image("The Becker-Faust", 800, 600, "zdf");
        AtomicContent image2 = new Image("Aaron Carter smiling", 1280, 720, "anonymous");
        article1.addElement(image1);
        article1.addElement(image2);
        tennisNews.addElement(article1);

        CompositeContent article2 = new Article("Greenpeace riots at Wimbledon finals: "
                        + "the grass is always greener on the artificial side", "dpd");
        tennisNews.addElement(article2);

        CompositeContent article3 = new Article("Mika Häkkinen back on track", "pdf");
        CompositeContent article4 = new Article("Alonso driving wrong-way at the Monaco Grand Prix", "ard");

        formula1.addElement(article3);
        formula1.addElement(article4);

        CompositeContent article5 = new Article("Paul Simon prays for Luis Suarez's soul", "gps");
        germanSoccer.addElement(article5);

        CompositeContent article6 = new Article("Oliver Kahn signs trainer contract at Schalke 04", "ddr");
        ukSoccer.addElement(article6);

        Visitor v1 = new InformationList();
        Visitor v2 = new Contents();
        v1.visit(sportsNews);
        System.out.println("\n=================\n");
        v2.visit(sportsNews);
    }

}
