package com.example.arminpuranyoussef.vokabeltrainer;

/**
 * This class creates ListNodes. Die Klasse ListNode repräsentieren Karteikarten.
 *
 * @author Armin.P.Leonard.B.Paul.W
 * @version 10.10.2018
 */
public class ListNode implements Comparable
{
    private Object deu;
    private Object eng;
    private ListNode next;

    /**
     * Konstruktor der eine Karteikarte erstellt die auf eine Nachfolgende
     * Karteiakrte zeigt.
     *
     * @param deu  das Deutsche Wort
     * @param eng  die Englische Übersetzung zu dem Deteutschen Wort
     * @param next  die nächste Karteikarte
     */
    public ListNode(Object deu, Object eng, ListNode next)
    {
        this.deu = deu;
        this.eng = eng;
        this.next = next;
    }

    /**
     * Konstruktor für eine Karteikarte ohne Nachfolger
     *
     * @param deu  das Deutsche Wort
     * @param eng  die Englische Übersetzung zu dem Deteutschen Wort
     */
    public ListNode(Object deu, Object eng)
    {
        this.deu = deu;
        this.eng = eng;
        this.next = null;
    }

    /**
     * Methode der die Deutsche Bedeutung des Wortes zurück gibt
     *
     * @return die Deutsche Bedeutung
     */
    public String getDeu()
    {
        return this.deu.toString();
    }

    /**
     * Methode der die Englische Bedeutung des Wortes zurück gibt
     *
     * @return die Englische Bedeutung
     */
    public String getEng()
    {
        return this.eng.toString();
    }

    /**
     * Methode der die Deutsche Bedeutung des Wortes verändert
     *
     * @param s die neue Deutsche Bedeutung
     */
    public void setDeu(String s)
    {
        this.deu = s;
    }

    /**
     * Methode der die Englische Bedeutung des Wortes verändert
     *
     * @param s  die neue Englische Bedeutung
     */
    public void setEng(String s)
    {
        this.eng = s;
    }

    /**
     * Methode um die Nachfolgende Karteikarte der aktuellen Karteikarte zurückzugeben.
     *
     * @return die Nachfolgende Karteikarte
     */
    public ListNode getNext()
    {
        return this.next;
    }

    /**
     * Methode um den Nachfolger der Karteikarte zu setzen
     *
     * @param n  der Nachfolger auf der die aktuelle Katteikarte zeigen soll.
     */
    public void setNext(ListNode n)
    {
        this.next = n;
    }

    /**
     * Methode die die Detusche Bedeutung zweier Karteikarten vergleicht.
     * Es werden die Anfangsbuchstaben verglichen. Bsp.: a < h
     *
     * @param n  die zu vergleichende Karteikarte
     * @return eine Zahl kleiner 0 wenn das übergebende Objekt größer ist
     * Gibt 0 aus wenn das übergebende Objekt gleich groß ist.
     * Eine Zahl größer als 0 wenn das übergebende Objekt kleiner ist.
     */
    @Override
    public int compareTo(Object n)
    {
        ListNode k = (ListNode)n;
        return this.deu.toString().compareTo(k.getDeu());
    }

    public String toString()
    {

            return (String) deu;

    }

    public String engString()
    {
        return (String) eng;
    }
}
