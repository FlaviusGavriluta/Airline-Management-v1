
# Airline Management
You received a task to model an Airline's internal structure.
Design the model based on the following requirements:

### Airline
- stores all available flights
- stores all employees
#### extra algorithms:
Option 1: can find the flight attendant who speaks the most amount of languages
Option 2: can find the pilot who flies on the most amount of flights

Every Airline Employee has a name and birthdate.
### Flight Attendants
You have to store which languages flight attendants speak from the relevant ones (English, German, Spanish, Russian).
### Pilot
Pilots get premium quality Analog Compass but only once, sometime after they got employed
### Flight
- Every flight has a unique identifier and a language from the list above.
- A Flight has two Pilots, and at least three Flight Attendants.
- Pilots can be either Captain or Co-pilot on a flight. A Co-pilot on a flight can be captain on another one.
- We should be able to check if a flight is ready to take off (with checking every Employee whether they are ready or not)
The conditions of the clearance are:
- The Captain and the Co-pilot have received their Compasses already.
- All the Attendants speak the language of the flight.

## Testing
- test if flight is ready for take off
