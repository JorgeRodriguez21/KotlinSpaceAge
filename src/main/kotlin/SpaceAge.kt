import java.math.BigDecimal
import java.math.MathContext
import java.math.RoundingMode

class SpaceAge {

    private var secondsTime: BigDecimal

    constructor(secondsTimeLong: Long) {
        secondsTime = BigDecimal(secondsTimeLong)
    }

    private val earthYearInSeconds = BigDecimal(31557600)
    private val mercuryEarthYears = BigDecimal(0.2408467)
    private val venusEarthYears = BigDecimal(0.61519726)
    private val marsEarthYears = BigDecimal(1.8808158)
    private val jupiterEarthYears = BigDecimal(11.862615)
    private val saturnEarthYears = BigDecimal(29.447498)
    private val uranusEarthYears = BigDecimal(84.016846)
    private val neptuneEarthYears = BigDecimal(164.79132)

    private fun getEarthYears() = secondsTime.divide(earthYearInSeconds, 3, RoundingMode.HALF_UP)

    fun onEarth(): Double {
        return getEarthYears().round(MathContext(4)).toDouble()
    }

    private fun getAgeForEachPlanet(age: BigDecimal) = getEarthYears().divide(age, 2, RoundingMode.HALF_UP).toDouble()

    fun onMercury(): Double {
        return getAgeForEachPlanet(mercuryEarthYears)
    }

    fun onVenus(): Double {
        return getAgeForEachPlanet(venusEarthYears)
    }

    fun onMars(): Double {
        return getAgeForEachPlanet(marsEarthYears)
    }

    fun onJupiter(): Double {
        return getAgeForEachPlanet(jupiterEarthYears)
    }

    fun onSaturn(): Double {
        return getAgeForEachPlanet(saturnEarthYears)
    }

    fun onUranus(): Double {
        return getAgeForEachPlanet(uranusEarthYears)
    }

    fun onNeptune(): Double {
        return getAgeForEachPlanet(neptuneEarthYears)
    }

}