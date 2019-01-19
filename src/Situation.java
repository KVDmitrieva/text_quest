public class Situation {
     static int line;
    Situation [] direction;

    String text;
    String subject;
    int dhealth;
    int dmind;
    int dstrength;
   // direction=new Situation[1][variants];
    public Situation (String subject, String text, int variants, int dh,int dm,int ds) {
        this.subject=subject;
        this.text=text;
        this.dhealth = dh;
        this. dmind =dm;
        this.dstrength=ds;
        direction = new Situation[variants];


    }
}