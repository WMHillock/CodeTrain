/*
DESCRIPTION:
Your colleagues have been looking over you shoulder.
When you should have been doing your boring real job,
you've been using the work computers to smash in endless hours of codewars.

In a team meeting, a terrible, awful person declares
to the group that you aren't working. You're in trouble.
You quickly have to gauge the feeling in the room to decide
whether or not you should gather your things and leave.

Given a Person array (meet) containing team members,
you need to assess the overall happiness rating of the
group. If <= 5, return "Get Out Now!". Else return "Nice Work Champ!".

The Person class looks like:

class Person {
  final String name;    // team memnber's name
  final int happiness;  // happiness rating out of 10
}
Happiness rating will be total score / number of people in the room.

Note that your boss is in the room (boss), their score
is worth double it's face value (but they are still just one person!).
 */
package difficulty.kyu7.officesTasks;

public class OfficeHappiness {
    public static void main(String[] args) {
        Person[] meet = new Person[] {
                new Person("tim", 2),
                new Person("jim", 4),
                new Person("randy", 0),
                new Person("sandy", 5),
                new Person("andy", 8),
                new Person("katie", 6),
                new Person("laura", 2),
                new Person("saajid", 2),
                new Person("alex", 3),
                new Person("john", 2),
                new Person("mr", 8)
        };
        System.out.println(outed(meet, "john"));
    }


    public static String outed(Person[] meet, String boss) {
        int happiness = 0;
        for(Person p : meet) {
            if(p.getName().equals(boss)) {
                happiness += p.getHappiness() * 2;
            } else {
                happiness += p.getHappiness();
            }
        }
        return (happiness / meet.length) >= 5 ? "Nice Work Champ!" :  "Get Out Now!";
    }
}
