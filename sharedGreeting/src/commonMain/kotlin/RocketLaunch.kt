//import kotlinx.serialization.SerialName
//import kotlinx.serialization.Serializable

//@Serializable
class RocketLaunch {
//    @SerialName("flight_number")
    var flightNumber: Int

        get() = this.flightNumber;

        set(i: Int) : Unit {
            this.flightNumber = i;
        }
//    @SerialName("name")
    var missionName: String

        get() : String {
            return missionName;
        }
        set(tst: String) : Unit {
            this.missionName = tst;
        }

//    @SerialName("date_utc")
    var launchDateUTC: String

        get(): String {
            return this.launchDateUTC;
        }
        set(tst2: String): Unit {
            this.launchDateUTC = tst2;
        }

//    @SerialName("success")
    var launchSuccess: Boolean?

        get() : Boolean? {
            if (this.launchSuccess != null) {
                return this.launchSuccess;
            } else {
                return this.launchSuccess;
            }
        }
        set(tst3: Boolean?) : Unit {
            this.launchSuccess = tst3
        }

//    @SerialNumber("mission_comment")
    var missionDescription: String
        get(): String {
           return this.missionDescription;
        }
        set(tst4: String): Unit {
           this.missionDescription = tst4;
        }

    constructor(
        flightNumber: Int,
        missionName: String,
        launchDateUTC: String,
        launchSuccess: Boolean?,
        missionDescription: String
    ) {
        this.flightNumber = flightNumber
        this.missionName = missionName
        this.launchDateUTC = launchDateUTC
        this.launchSuccess = launchSuccess
        this.missionDescription = missionDescription
    }

    override fun toString(): String {
        return "RocketLaunch(flightNumber=$flightNumber, missionName='$missionName', launchDateUTC='$launchDateUTC', launchSuccess=$launchSuccess, missionDescription='$missionDescription')"
    }


}