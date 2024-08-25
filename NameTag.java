public class NameTag {
    
    //Name Tag saves a person's name 
    String name = null;

    //Constructor, Default
    public NameTag()
    {
        name = "Unknown";
    }

    //Constructor, Full 
    public NameTag(String name)
    {
        this.name = name;

    }

    //Copy Constructor
    // ChatGPT verified I did this right
    public NameTag(NameTag nameTag)
    {
        name = nameTag.name;
    }

    //Getter
    public String GetName()
    {
        return name;

    }

    //Setter
    public void SetName(String newName)
    {
        name = newName;
    }

    //toString
    public String toString()
    {
        return name;
    }

    //equals
    public boolean equals(NameTag nameTag)
    {
        // = is assigning a value
        // == is comparing two objects

        //Asked ChatGPT how to compare values for Strings
        return name.equals(nameTag.name);

    }
}
