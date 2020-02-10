public class ampmClock extends clock{
  public String clocktype;
  public ampmClock(int h, int m, String c){
    super(h, m);
    clocktype = c;
  }
  public void changeampm(){
    if (hours < 12){
      clocktype = "am";
      }
      else{
        clocktype = "pm";
      }
    }
  public String getampmTime(){
    String time;
    changeampm();
    return(getTime() + clocktype);
  }
}