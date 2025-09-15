public class Student
{
    private String   name;
    private int      alter;
    private boolean  matura;
    
    public String getName()
    {
        return name;
    }
    
    public int getAlter()
    {
        return alter;
    }
    
    public boolean getMatura()
    {
        return matura;
    }
    
    public void setName(String neuName)
    {
        name = neuName;    
    }
    
    public void setAlter(int neuAlter)
    {
        alter = neuAlter;
    }
    
    public void setMatura(boolean neuMatura)
    {
        matura = neuMatura;
    }
}