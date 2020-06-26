package MockUI;

public class CalculatorService {

    Icalculator ical;

    public CalculatorService(Icalculator ser){
      this.ical= (Icalculator) ser;
    }


    public int perform(int x, int y){
      return  ical.add( x, y)*x;
    }

}
