public class MakeAList{
  public int listsize;
  public MakeAList(int l){
    listsize = l;
    int[] list;
    list  = new int[listsize];
  }
  public int findLowest(){
    public int lowest;
    lowest = list[0];
    for(int i=0; i<listsize; i++){
      if(list[i]<lowest){
        lowest = list[i];
      }
    return(lowest);
    }
  }
}
      
    
        
    
      
      
  