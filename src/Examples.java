import static org.junit.Assert.*;
import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

/**
 * Examples class for tests
 * @author Jean-Luc , Roman
 *
 **/

public class Examples {

    ShootingRound shootingRound1 = new ShootingRound(1, true);
    ShootingRound shootingRound2 = new ShootingRound(3, true);
    ShootingRound shootingRound3 = new ShootingRound(2, true);
    ShootingRound shootingRound4 = new ShootingRound(5, true);
    ShootingRound shootingRound5 = new ShootingRound(4, true);
    ShootingRound shootingRound6 = new ShootingRound(1, false);
    ShootingRound shootingRound7 = new ShootingRound(3, false);
    ShootingRound shootingRound8 = new ShootingRound(2, false);
    ShootingRound shootingRound9 = new ShootingRound(5, false);
    ShootingRound shootingRound10 = new ShootingRound(4, false);

    LinkedList<ShootingRound> shootingResult1list = new LinkedList<ShootingRound>();
    LinkedList<ShootingRound> shootingResult2list = new LinkedList<ShootingRound>();
    LinkedList<ShootingRound> shootingResult3list = new LinkedList<ShootingRound>();
    LinkedList<ShootingRound> shootingResult4list = new LinkedList<ShootingRound>();
    LinkedList<ShootingRound> shootingResult5list = new LinkedList<ShootingRound>();

    LinkedList<Athlete> athletes = new LinkedList<Athlete>();
    LinkedList<Athlete> athletes2 = new LinkedList<Athlete>();
    LinkedList<Athlete> athletes3 = new LinkedList<Athlete>();
    LinkedList<Athlete> athletes4 = new LinkedList<Athlete>();
    LinkedList<Athlete> athletes5 = new LinkedList<Athlete>();

    Competition first = new Competition(5, athletes);
    Competition second = new Competition(2, athletes2);
    Competition third = new Competition(3, athletes3);
    Competition fourth = new Competition(4, athletes4);
    Competition fifth = new Competition(5, athletes5);

    @Before
    public void setUp() {
        shootingResult1list.add(shootingRound1);
        shootingResult1list.add(shootingRound2);
        shootingResult1list.add(shootingRound3);
        shootingResult1list.add(shootingRound4);
        shootingResult2list.add(shootingRound2);
        shootingResult2list.add(shootingRound4);
        shootingResult2list.add(shootingRound5);
        shootingResult2list.add(shootingRound1);
        shootingResult3list.add(shootingRound6);
        shootingResult3list.add(shootingRound7);
        shootingResult3list.add(shootingRound8);
        shootingResult3list.add(shootingRound9);
        shootingResult4list.add(shootingRound10);
        shootingResult4list.add(shootingRound1);
        shootingResult4list.add(shootingRound8);
        shootingResult4list.add(shootingRound3);
        shootingResult5list.add(shootingRound10);
        shootingResult5list.add(shootingRound4);
        shootingResult5list.add(shootingRound9);
        shootingResult5list.add(shootingRound5);
        athletes.add(athlete1);
        athletes.add(athlete2);
        athletes.add(athlete3);
        athletes.add(athlete4);
        athletes2.add(athlete1again);
        athletes2.add(athlete2);
        athletes2.add(athlete3);
        athletes2.add(athlete4);
        athletes3.add(athlete1again);
        athletes4.add(athlete1);
        athletes5.add(athlete1);
        athletes5.add(athlete2);
        athletes5.add(athlete3);
        athletes5.add(athlete4);
    }





    ShootingResult shootingResult = new ShootingResult(shootingResult1list);
    ShootingResult shootingResult2 = new ShootingResult(shootingResult2list);
    ShootingResult shootingResult3 = new ShootingResult(shootingResult3list);
    ShootingResult shootingResult4 = new ShootingResult(shootingResult4list);
    ShootingResult shootingResult5 = new ShootingResult(shootingResult5list);
    SkiingResult skiingResult = new SkiingResult(3, 12.0, 14.0, 13.0, 12.0, 7);	//Position, Lap 1, Lap 2, Lap 3, Lap 4, penalties
    SkiingResult skiingResult2 = new SkiingResult(2, 11.0, 20.0, 3.0, 5.0, 5);
    SkiingResult skiingResult3 = new SkiingResult(4, 15.0, 17.0, 13.0, 14.0, 11);	//Position, Lap 1, Lap 2, Lap 3, Lap 4, penalties
    SkiingResult skiingResult4 = new SkiingResult(1, 10.0, 10.0, 3.0, 5.0, 5);
    FinalResult finalResult = new FinalResult(shootingResult, skiingResult);
    FinalResult finalResult2 = new FinalResult(shootingResult2, skiingResult2);
    FinalResult finalResult3 = new FinalResult(shootingResult3, skiingResult3);
    FinalResult finalResult4 = new FinalResult(shootingResult4, skiingResult4);
    FinalResult finalResult5 = new FinalResult(shootingResult5, skiingResult4);


    Athlete athlete1 = new Athlete(finalResult, "tim");
    Athlete athlete1again = new Athlete(finalResult5, "tim");
    Athlete athlete2 = new Athlete(finalResult2, "john");
    Athlete athlete3 = new Athlete(finalResult3, "hank");
    Athlete athlete4 = new Athlete(finalResult4, "kyle");

    // @Test
    // public void testAdultDilloCanShelter() {
    //    assertFalse(adultDillo.canShelter());
    // }

    @Test
    public void testPointsEarnedShooter() {
        assertEquals(shootingResult.pointsEarned(), 11.0, 0);
    }

    @Test
    public void testPenaltiesEarnedShooter() {
        assertEquals(shootingResult.getPenalties(), 540, 0);
    }

    @Test
    public void testPointsEarnedSkiing() {
        assertEquals(skiingResult.pointsEarned(), 51.0, 0);
    }

    @Test
    public void testPenaltiesEarnedSkiing() {
        assertEquals(skiingResult.getPenalties(), 35, 0);
    }

    @Test
    public void testFinalScore() {
        assertEquals(finalResult.finalScore(), 623, 0);
    }

    @Test
    public void testBetterSkier() {
        assertTrue(athlete2.betterSkiier(athlete1));
    }

    @Test
    public void testBetterShooter() {
        assertFalse(athlete1.betterShooter(athlete2));
    }

    @Test
    public void testHasBeaten() {
        assertTrue(athlete2.hasBeaten(athlete1));
    }

    @Test
    public void testHasBeaten2(){
        assertFalse(athlete1.hasBeaten(athlete2));
    }

    @Test
    public void testBestRoundByTypeTrue(){
        assertEquals(shootingResult.bestRoundByType(true), shootingRound4);
    }
    
    @Test
    public void testBestRoundByTypeTrue2(){
        assertEquals(shootingResult3.bestRoundByType(true), null);
    }
    
    @Test
    public void testBestRoundByTypeTrue3(){
        assertEquals(shootingResult4.bestRoundByType(true), shootingRound3);
    }

    @Test
    public void testBestRoundByTypeFalse(){
        assertEquals(shootingResult.bestRoundByType(false), null);
    }
    
    @Test
    public void testBestRoundByTypeFalse2(){
        assertEquals(shootingResult3.bestRoundByType(false), shootingRound9);
    }
    
    @Test
    public void testBestRoundByTypeFalse3(){
        assertEquals(shootingResult4.bestRoundByType(false), shootingRound10);
    }

    @Test
    public void testShootingDNF(){
        LinkedList<String> athleteNames1 = new LinkedList<String>();
        athleteNames1.add("tim");
        athleteNames1.add("john");
        athleteNames1.add("hank");
        athleteNames1.add("kyle");

        assertEquals(first.shootingDNF(), athleteNames1);
    }

    @Test
    public void testShootingDNFAgain(){
        LinkedList<String> athleteName2 = new LinkedList<String>();

        assertEquals(second.shootingDNF(), athleteName2);
    }

    @Test
    public void testFinalScoreForAthlete(){
        assertEquals(first.finalScoreForAthlete("tim"), 623.0, 0);

    }
    
    @Test
    public void testFinalScoreForAthlete2(){
        assertEquals(second.finalScoreForAthlete("tim"), 163.0, 0);

    }

    //Add a heck ton of more tests, make more competitions with the same athlete having different scores
    @Test
    public void testAnyImprovement(){
        assertFalse(first.anyImprovement(second));
    }
    
    @Test
    public void testAnyImprovement2(){
        assertTrue(second.anyImprovement(first));
    }
    
    @Test
    public void testAnyImprovement3(){
        assertTrue(third.anyImprovement(fourth));
    }
    
    @Test
    public void testAnyImprovement4(){
        assertFalse(fourth.anyImprovement(third));
    }
    
    @Test
    public void testAnyImprovement5(){
        assertFalse(first.anyImprovement(fifth));
    }

}