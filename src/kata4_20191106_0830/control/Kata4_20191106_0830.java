package kata4_20191106_0830.control;

import java.util.List;
import kata4_20191106_0830.model.Histogram;
import kata4_20191106_0830.model.Mail;
import kata4_20191106_0830.view.HistogramDisplay;
import kata4_20191106_0830.view.MailHistogramBuilder;
import kata4_20191106_0830.view.MailListReader;

public class Kata4_20191106_0830 {

    public static void main(String[] args) {
        String fileName = new String("email.txt");
        /* I */ List<Mail> mailList = MailListReader.read(fileName);
        /* P */ Histogram histogram = MailHistogramBuilder.build(mailList);
        /* O */ HistogramDisplay historgramdisplay = new HistogramDisplay(histogram);
        /* O */ historgramdisplay.execute();
        
        
    }
    
}
