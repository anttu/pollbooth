Simple poll application (Grails practice)
=========

This application will make a html page in which one can create simple polls for mobile usage

Feature implemented
---------
None

Features to be implemented
------
- Must use name (non-unique) when answering polls
- Owner must be able to modify poll before any answers have been given
- Polls must have end-date
- Support for submitting answer options
- Support for submitting answers
- Owner must be able to see own polls
- Users must be able to see answered polls
- Timer for end-of-poll

Visuals
------
- Nice bars for showing the amount of different answers
- ajax for updating results
- mobile-friendly (responsive?)


Friends
------
- show a list of friends' active polls (order by active polls)
- keep a list of friends (answered their polls)
- keep a list of friends friends??
- keep a list of acquaintances (answered same polls)
- FB share

Persistency
------
- Use MySQL


Performance
------
- cache-control headers
- list of pages which can be served from cache
- ESI-tags?
- stress test


Anti-cheat
------
- require cookie
- filter same ip-addresses option
- list of username / cookie
- can change vote (no duplicate votes)


Phase 2.0
-------
- Google ADs
- google map of voter IPs
- show countries
- filter countries
- FB integration
- Hosting
- DNS
