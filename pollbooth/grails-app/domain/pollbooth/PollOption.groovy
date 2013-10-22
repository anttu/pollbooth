package pollbooth

class PollOption {

    static constraints = {

    }

    static belongsTo = [poll: Poll]

    /* Possible answer for the poll */
    String pollOption

}
