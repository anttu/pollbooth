package pollbooth

class PollService {

    //private static transactional = false

    def List<Poll> getActivePolls() {

        return Poll.findAll()

    }

    def createPoll(String JSESSIONID, String description) {

        log.info("Creating poll for user ${JSESSIONID}")

        def poll = new Poll(JESSIONID: JSESSIONID, description: description )

        poll.save()

        return poll


    }

    def addOption(String ID, String option) {

        def poll = Poll.get(ID)

        /* TODO Check for duplicate options */
        poll.addToOptions(new PollOption(pollOption: option))

        poll.save(failOnError: true, flush: true)

    }

    def addDescription(String ID, String description) {

    }

    /* Get (read-only) Poll object */
    def Poll getPoll(String ID) {

        Poll.read(ID)

    }




}
