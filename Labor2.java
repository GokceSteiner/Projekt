public class Labor2
{
    private String gebaude;
    private int stock;
    private boolean beamer;
    private int anzPlatze;
    
    
    public Labor2(String gebaude, int stock, boolean beamer, int anzPlatze)
    {
        setGebaude(gebaude);
        setStock(stock);
        setBeamer(beamer);
        setAnzPlatze(anzPlatze);
    }
    
    public Labor2()
    {
        setGebaude("C");
        setStock(5);
        setBeamer(true);
        setAnzPlatze(20);
    }
    
    public Labor2(String gebaude, int Stock)
    {
        setGebaude(gebaude);
        setStock(stock);
        setBeamer(true);
        setAnzPlatze(20);
    }
    
    public Labor2(String gebaude, boolean beamer)
    {
        setGebaude(gebaude);
        setStock(5);
        setBeamer(beamer);
        setAnzPlatze(20);
    }
    
    
    public void setGebaude(String gebaude)
    {
        this.gebaude = gebaude;
    }
    
    public void setStock(int stock)
    {
        this.stock = stock;
    }
    
    public void setBeamer(boolean beamer)
    {
        this.beamer = beamer;
    }
    
    public void setAnzPlatze(int anzPlatze)
    {
        this.anzPlatze = anzPlatze;
    }
    
    
    public String getGebaude()
    {
        return gebaude;
    }
    
    public int getStock()
    {
        return stock;
    }
    
    public boolean getBeamer()
    {
        return beamer;
    }
    
    public int getAnzPlatze()
    {
        return anzPlatze;
    }
    
    public void printLabor2()
    {
        System.out.println("Gebaude " + gebaude + " befindet sich im " + stock + ". Stock " + "und hat " + anzPlatze + " Plätze");
    }

}