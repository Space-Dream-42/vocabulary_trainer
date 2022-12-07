package com.example.arminpuranyoussef.vokabeltrainer;

/**
 * This class creates lists LMAO(Laughing my ass off).
 *
 * @author Armin.P.Leonard.B.Paul.W
 * @version 12.10.2018
 */
public class List
{
    private ListNode first;
    private ListNode current;
    private ListNode last;
    private int      anz = 0;

    /**
     * Konstrukter der eine leere Liste erzeugt
     */
    public List()
    {
        this.first = null;
        this.current = null;
        this.last = null;
    }

    /**
     * Konstruktor der eine gefüllte Liste erstellt
     *
     * @param n eine Karteikarte oder eine Karteikartensammlung
     */
    public List(ListNode n)
    {
        this.first = n;
        this.current = n;

        while(n.getNext() != null)
        {
            n = n.getNext();
        }

        this.last = n;
    }

    /**
     * Methode die eine- oder eine Karteikartensammlung zur Liste hizufügt.
     *
     * @param n eine Karteikarte oder eine Karteikartensammlung
     */
    public void add(ListNode n)
    {
        if(last != null)
        {
            last.setNext(n);
            ListNode s = n;

            while(s.getNext() != null)
            {
                s = s.getNext();
            }

            last = s;
            anz++;
        }
        else
        {
            first = n;
            last = n;
            current = n;
            anz++;
        }
    }

    /**
     * Methode um eine Karteikarte aus der Liste zu entfernen.
     *
     * @param n die zu entfernende Karteikarte
     */
    public void remove(ListNode n)
    {
        this.current = this.first;

        if(current.compareTo(n) == 0)
        {
            first = current.getNext();
            return;
        }
        else
        {
            while(current.getNext().getNext() != null)
            {
                if(current.getNext().compareTo(n) != 0)
                {
                    current = current.getNext();
                }
                else
                {
                    current.setNext(current.getNext().getNext());
                    return;
                }
            }

            if(current.getNext().compareTo(n) == 0)
            {
                last = current;
                current.setNext(null);
                return;
            }
            else
            {
                return;
            }
        }
    }

    /**
     * Methdoe die Prüft ob eine Methode leer ist.
     *
     * @return true wenn die Liste leer ist.
     * False wenn die Liste gefüllt ist.
     */
    public boolean isEmpty()
    {
        if(first != null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    /**
     * Methode der die erste Karteikarte der Liste zurück gibt.
     *
     * @return die erste Karteikarte der Liste
     */
    public ListNode getFirst()
    {
        return first;
    }

    /**
     * Methode der die Letzte Karteikarte der Liste zurück gibt.
     *
     * @return die Letzte Karteikarte der Liste
     */
    public ListNode getLast()
    {
        return last;
    }

    /**
     * Methode um current zurückzugeben.
     *
     * @return current
     */
    ListNode getCurrent()
    {
        return current;
    }

    /**
     *
     */
    public void insert(ListNode n)
    {
    }

    /**
     *
     */
    public void addList(List n)
    {
    }

    public String[] toArrayStringDeu()
    {
      current = first;
        String[] ret = new String[anz];
         for (int i = 0; i < anz; i++)
         {
             ret[i] = current.toString();
             current = current.getNext();
         }
         return ret;
    }

    public String[] toArrayStringEng()
    {
        current = first;
        String[] ret = new String[anz];
        for (int i = 0; i < anz; i++)
        {
            ret[i] = current.engString();
            current = current.getNext();
        }
        return ret;
    }



    public String toString()
    {
        if(isEmpty())
        {
            return "Liste ist leer.";
        }
        else
        {
            return first.toString();
        }
    }
}
