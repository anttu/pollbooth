package pollbooth

class Poll {

    static constraints = {
    }

    /* Owners ID */
    String JESSIONID
    /* Description of the poll */
    String description
    /* Possible answers for the poll */
    Set<PollOption> options


}
