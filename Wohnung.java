public class Wohnung
{
    private String  ort;
    private boolean balkon;
    private int     preis;
    private int     anzZimmer;
    
    public String getOrt()
    {
        return ort;
    }
    
    public boolean getBalkon()
    {
        return balkon;
    }
    
    public int getPreis()
    {
        return preis;
    }
    
    public int getAnzZimmer()
    {
        return anzZimmer;
    }
    
    public void setOrt(String neuOrt)
    {
        ort = neuOrt;
    }
    
    public void setBalkon(boolean neuBalkon)
    {
        balkon = neuBalkon;
    }
    
    public void setPreis(int neuPreis)
    {
        preis = neuPreis;
    }
    
    public void setAnzZimmer(int neuAnzZimmer)
    {
        anzZimmer = neuAnzZimmer;
    }
}
