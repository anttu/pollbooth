package pollbooth

class Poll {

    static constraints = {
    }

    static mapping = {
                options cascade: 'all-delete-orphan'
    }

    static hasMany = [options: PollOption]

    /* Owners ID */
    String JESSIONID
    /* Description of the poll */
    String description




}
