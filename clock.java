public class clock{
  public int hours, mins;
  public clock(int h, int m){
    hours = h;
    mins = m;
  }
  public String getTime(){
    return(hours + ":" + mins);
  }
  public void incmins(){
    if (mins == 59){
      mins = 0;
      if (hours == 23){
        hours = 0;
      }
        else{
          hours++;
        }
      }
      else{
        mins = mins++;
      }
    }
  }



    
      
      
    
      
      
        
            
           
  