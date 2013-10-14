package pollbooth

class PollService {

    //private static transactional = false

    def /*List<Poll>*/ getActivePolls() {

        //return Poll.findAll().count {}
        //return Poll.count()
        return Poll.findAll()

    }

    def createPoll(String JSESSIONID) {

        log.info("Creating poll for user ${JSESSIONID}")

        def poll = new Poll(JESSIONID: JSESSIONID)

        poll.description ="Foobar"


        poll.save()
        poll.validate()
        return poll


    }

    def addOption(String ID, String option) {

    }

    def addDescription(String ID, String description) {

    }

    def getPoll(String ID) {

    }




}
