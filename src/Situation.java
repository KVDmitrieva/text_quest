public class Situation {
    Situation [] direction;
    String text;
    String subject;
    int dhealth;
    int dmind;
    int dstrength;
    public Situation (String subject, String text, int variants, int dk,int da,int dr) {
        this.subject=subject;
        this.text=text;
        this.dhealth = dk;
        this. dmind =da;
        this.dstrength=dr;
        direction=new Situation[variants];
    }
}