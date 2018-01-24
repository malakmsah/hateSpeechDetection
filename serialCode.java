/**
* Serial code
**/

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import myClass.BlogPosts2;

//import java.util.*;
//import javax.mail.*;
//import javax.mail.internet.*;
//import javax.activation.*;

public class JavaApplication11 {

    public static void main(String[] args) {
        System.out.println("Execution started!");
        // Load data
        BlogPosts2 blogPosts = new BlogPosts2();
        String fBPosts[] = blogPosts.getFBPosts();
        String hateWordsList[] = getHateWords();

        // Start execution
        java.util.Date startTime = new java.util.Date(System.currentTimeMillis());
        System.out.println("Execution started at : " + startTime);
        {
            for (int j = 0; j < fBPosts.length; j++) {
                String textBody = fBPosts[j];
                for (int i = 0; i < hateWordsList.length; i++) {
                    boolean e = inParagraph(textBody, hateWordsList[i]);
                    if (e) {
                        System.out.println("'" + hateWordsList[i] + "'" + " found in the paragraph .");
                    }
                }
            }
        }
        java.util.Date endtime = new java.util.Date(System.currentTimeMillis());
        System.out.println("Execution ended at : " + endtime);
        // End execution
    }

    private static boolean inParagraph(String paragraph, String word) {
        String pt = "\\b" + word + "\\b";
        Pattern pattern = Pattern.compile(pt);
        Matcher matcher = pattern.matcher(paragraph);
        return matcher.find();
    }

    private static void sendAlertEmail() {
        try {
            // send email
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }

    private static String[] getHateWords() {
        return new String[]{
                "mortar",
                "Trump",
                "Allophilia",
                "Animal cruelty",
                "Animal testing",
                "Anti-cultural sentiment",
                "Assimilation",
                "Bias",
                "Blood libel",
                "Blood sport",
                "Carnism",
                "Christian privilege",
                "Class conflict",
                "Compulsory sterilization",
                "Counter-jihad",
                "Cultural genocide",
                "Democide",
                "Disability hate crime",
                "Diversity",
                "Economic",
                "Eliminationism",
                "Employment",
                "Enemy of the people",
                "Ethnic cleansing",
                "Ethnic hatred",
                "Ethnic joke",
                "Ethnic penalty",
                "Ethnocide",
                "Eugenics",
                "Forced conversion",
                "Freak show",
                "Gay bashing",
                "Gendercide",
                "Genital mutilation",
                "Genocide",
                "Group libel",
                "Hate crime",
                "Hate group",
                "Hate speech",
                "Homeless dumping",
                "Housing",
                "Indian rolling",
                "Intersectionality",
                "Lavender scare",
                "LGBT hate crime",
                "Lynching",
                "Male privilege",
                "Masculism",
                "Meat eating",
                "Mortgage",
                "Multiculturalism",
                "Murder music",
                "Neurodiversity",
                "Occupational segregation",
                "Oppression",
                "Persecution",
                "Persecution",
                "Pogrom",
                "Police brutality",
                "Political correctness",
                "Power distance",
                "Prejudice",
                "Purge",
                "Race war",
                "Racial bias in criminal news",
                "Racism by country",
                "Red",
                "Regressive left",
                "Religious intolerance",
                "Religious persecution",
                "Scapegoating",
                "Scare",
                "Segregation academy",
                "Sex-selective abortion",
                "Slavery",
                "Slut-shaming",
                "Snobbery",
                "Social exclusion",
                "Social stigma",
                "Stereotype threat",
                "Trans bashing",
                "Victimization",
                "Violence against women",
                "White flight",
                "White power music",
                "White privilege",
                "Wife selling",
                "Witch-hunt",
                "Nazi crew",
                "Nazi"
        };
    }
}
