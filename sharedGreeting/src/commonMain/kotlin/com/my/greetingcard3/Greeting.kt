package com.my.greetingcard3

import kotlin.random.Random
import io.ktor.client.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

import io.ktor.client.call.*
import io.ktor.client.request.*

import RocketLaunch

class Greeting {
    private val platform: Platform = getPlatform()

    /*
    Dodatna koda je na strani
    https://github.com/ktorio/ktor-documentation/blob/2.3.4/codeSnippets/snippets/client-json-kotlinx/src/main/kotlin/com/example/Application.kt
    ki dobi tudi response s podatki Osebe, pardon Customerja, ki pa je naprimer sam JetBrains
     */
    private val httpClient = HttpClient {
        install(ContentNegotiation) {
            json( Json  {
                prettyPrint = true
                isLenient = true
                ignoreUnknownKeys = true
            }  )
        }
    }
    suspend fun greet(): List<String> = buildList {
       val rockets: List<RocketLaunch> =
            httpClient.get("https://api.spacexdata.com/v4/launches").body()
       val lastSuccessLaunch = rockets.last { it.launchSuccess == true }

       add( if (Random(1).nextBoolean()) "Hi!" else "Hello!" )
       add( "Guess what is it! > ${platform.name.reversed()}!" )
       add("\nThere are only ${daysUntilNewYear()} days left until New Year! ")

       add("\nThe last successful launch was ${lastSuccessLaunch.launchDateUTC} 🚀")

    }
}
