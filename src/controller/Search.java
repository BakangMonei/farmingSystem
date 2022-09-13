package controller;


import model.User;

import java.util.ArrayList;

public class Search
{

    // Searching by District
    public ArrayList<User> searchDistrict(String type, ArrayList<User> records, ArrayList<User> results)
    {

        for(int i = 0; i < records.size(); i++)
        {
            if(records.get(i).getDistrict().equals(type))
            {
                //Append to results:
                results.add(records.get(i));
            }
        }

        return results;
    }
    // Searching by SubDistrict
    public ArrayList<User> searchSubDistrict(String type, ArrayList<User> records, ArrayList<User> results)
    {

        for(int i = 0; i < records.size(); i++)
        {
            if(records.get(i).getSubDistrict().equals(type))
            {
                //Append to results:
                results.add(records.get(i));
            }
        }

        return results;
    }

    // Searching by ID NUmber
    public int searchFarmerById(int id, ArrayList<User> records)
    {
        for (int index = 0; index < records.size(); index++)
        {
            if (records.get(index).getIDNum() == id)
                return index;
        }
        return -1;
    }

    // Search by Gender
    public ArrayList<User> searchByGender(char gender, ArrayList<User> records, ArrayList<User> results)
    {
        for(int i = 0; i < records.size(); i++)
        {
            if(records.get(i).getGender() == gender)
            {
                results.add(records.get(i));
            }
        }
        return results;
    }

    // Search by emailAddress
    public ArrayList<User> searchByEmailAdd(String city, ArrayList<User> records, ArrayList<User> results)
    {
        for(int i = 0; i < records.size(); i++)
        {
            if(records.get(i).getEmailAddress().equals(city))
            {
                results.add(records.get(i));
            }
        }
        return results;
    }

}
