package pollbooth

import pollbooth.wrapper.PollWrapper

class PollService {

    //private static transactional = false

    def List<Poll> getActivePolls() {

        return Poll.findAll()

    }

    def createPoll(String JSESSIONID, String description) {

        log.info("Creating poll for user ${JSESSIONID}")

        def poll = new Poll(ownerID: JSESSIONID, description: description )

        poll.save()

        return poll


    }

    def addOption(String ID, String option, String userID) {

        def poll = Poll.get(ID)

        if (poll.ownerID != userID) throw new RuntimeException("User doesn't own the poll")

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
