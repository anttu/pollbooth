package pollbooth

class PollService {

    //private static transactional = false

    def /*List<Poll>*/ getActivePolls() {

        return Poll.findAll().count {}
        //return Poll.count()
        //return Poll.all();

    }

    def createPoll(String JSESSIONID) {

        log.info("Creating poll for user ${JSESSIONID}")

        new Poll(JESSIONID: JSESSIONID).save()

    }

    def addOption(String ID, String option) {

    }

    def addDescription(String ID, String description) {

    }

    def getPoll(String ID) {

    }




}
