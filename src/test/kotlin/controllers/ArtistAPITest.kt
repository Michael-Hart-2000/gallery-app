package controllers

import models.Artist
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class ArtistAPITest {

    private var learnKotlin: Artist? = null
    private var summerHoliday: Artist? = null
    private var codeApp: Artist? = null
    private var testApp: Artist? = null
    private var swim: Artist? = null
    private var populatedArtists: ArtistAPI? = ArtistAPI()
    private var emptyArtists: ArtistAPI? = ArtistAPI()

    @BeforeEach
    fun setup(){
        learnKotlin = Artist(artistName = "Picasso" , artistAge = "90", artistCountry = "Spain" , artistMovement = "Cubism" , artistPopularity = 5 , isArtistAlive = false)
        summerHoliday = Artist(artistName = "Picasso" , artistAge = "90", artistCountry = "Spain" , artistMovement = "Cubism" , artistPopularity = 5 , isArtistAlive = false)
        codeApp = Artist(artistName = "Picasso" , artistAge = "90", artistCountry = "Spain" , artistMovement = "Cubism" , artistPopularity = 5 , isArtistAlive = false)
        testApp = Artist(artistName = "Picasso" , artistAge = "90", artistCountry = "Spain" , artistMovement = "Cubism" , artistPopularity = 5 , isArtistAlive = false)
        swim = Artist(artistName = "Picasso" , artistAge = "90", artistCountry = "Spain" , artistMovement = "Cubism" , artistPopularity = 5 , isArtistAlive = false)

        //adding 5 Artist to the artists api
        populatedArtists!!.add(learnKotlin!!)
        populatedArtists!!.add(summerHoliday!!)
        populatedArtists!!.add(codeApp!!)
        populatedArtists!!.add(testApp!!)
        populatedArtists!!.add(swim!!)
    }

    @AfterEach
    fun tearDown(){
        learnKotlin = null
        summerHoliday = null
        codeApp = null
        testApp = null
        swim = null
        populatedArtists = null
        emptyArtists = null
    }

    @Test
    fun `adding a Artist to a populated list adds to ArrayList`(){
        val newArtist = Artist(artistName = "Picasso" , artistAge = "90", artistCountry = "Spain" , artistMovement = "Cubism" , artistPopularity = 5 , isArtistAlive = false)
        assertEquals(5, populatedArtists!!.numberOfArtists())
        assertTrue(populatedArtists!!.add(newArtist))
        assertEquals(6, populatedArtists!!.numberOfArtists())
        assertEquals(newArtist, populatedArtists!!.findArtist(populatedArtists!!.numberOfArtists() - 1))
    }

    @Test
    fun `adding a Artist to an empty list adds to ArrayList`(){
        val newArtist = Artist(artistName = "Picasso" , artistAge = "90", artistCountry = "Spain" , artistMovement = "Cubism" , artistPopularity = 5 , isArtistAlive = false)
        assertEquals(0, emptyArtists!!.numberOfArtists())
        assertTrue(emptyArtists!!.add(newArtist))
        assertEquals(1, emptyArtists!!.numberOfArtists())
        assertEquals(newArtist, emptyArtists!!.findArtist(emptyArtists!!.numberOfArtists() - 1))
    }
}