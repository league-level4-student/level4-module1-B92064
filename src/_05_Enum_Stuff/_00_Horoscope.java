package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.

	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public static void main(String[] args) {

		printZodiac(Zodiac.ARIES);
	}

	public static void printZodiac(Zodiac type) {
		switch (type) {
		case ARIES: {
			JOptionPane.showMessageDialog(null,
					"Revive your love. Make this the year your love grows with a psychic love reading.");
			break;
		}
		case TAURUS: {
			JOptionPane.showMessageDialog(null,
					"You've been lucky for the last two months, there's no doubt about it. Lately it seems like your luck is changing. It's hard to pinpoint, but something isn't quite right in your daily life. At the moment, the planets are imparting some lessons that could be difficult to bear, Taurus. Get through this transition with as little pain as possible. The lessons you learn will prove worthwhile.");
			break;
		}
		case GEMINI: {
			JOptionPane.showMessageDialog(null, "This is going to be a good time to get a global view of things, Gemini. Take full advantage of the current planetary aspects by reading some books on spirituality or travel. If you desire to go on a long voyage, don't be surprised if your job sends you on an adventure, even if it isn't part of your job routine. Don't hesitate! Go breathe in some fresh air in a new place!");
			break;
		}
		case CANCER: {
			JOptionPane.showMessageDialog(null, "It's true that having to earn a living isn't always the most agreeable thing in life, Cancer. However, we all know that it's necessary. Have you thought about adding more balance to your life? All work and no play makes anyone a dull person. This would be a good day to examine your daily life and add some new elements. Yes, Cancer, it's time for you to choose a hobby.");
			break;
		}
		case LEO: {
			JOptionPane.showMessageDialog(null, "If you've had some problems in your sentimental life during the last few months, Leo, they're probably behind you now. It's a sure bet that you've learned something. You've been served the same dish for years and now it seems you've finally had enough! Know that from now on you'll be better about not falling into the same old traps.");
			break;
		}
		case VIRGO: {
			JOptionPane.showMessageDialog(null, "If you aren't the most self-assured person in the world, Virgo, take a look around and see all that you've done. True, you still have many unattained dreams, but look at how many you've already realized. A lack of confidence in your abilities is holding you back. There's a moment for everyone when a leap of faith is required. It's time for you to jump.");
			break;
		}
		case LIBRA: {
			JOptionPane.showMessageDialog(null, "You may meet some new people in the next few days, Libra. Someone in your professional life may help you launch some unusual experiments that have never been done before. Or someone may want to create a new service or get into a completely new market. You will be the one they seek to explore these exciting new avenues!");
			break;
		}
		case SCORPIO: {
			JOptionPane.showMessageDialog(null, "It seems as though you're trying to live down some criticism, Scorpio. For weeks you've taken special care to look over your work to catch any mistakes. Perhaps the number of errors you found surprised you. Criticism from others stung even more as a result, because you could see that it had some merit. Today you'll get some relief. In fact, you may receive some compliments.");
			break;
		}
		case SAGITTARIUS: {
			JOptionPane.showMessageDialog(null, "Smile, Sagittarius, because the forecast is bright today. You'll be in a curious mood, just right for new encounters. Perhaps this will add a little spice and enjoyment to your love life. There's a wide spectrum of experiences awaiting you, ready to offer fulfillment. A spirit of adventure prevails. You should take advantage of it!");
			break;
		}
		case CAPRICORN: {
			JOptionPane.showMessageDialog(null, "The Rolling Stones said it best, \"I can't get no satisfaction,\" and that's how you've been feeling lately, Capricorn. Indeed, looking back on your recent activities, you may feel a bit like a character in Wonderland - running as fast as you can just to stay in the same place. The day ahead will provide some relief and open up new, more fulfilling opportunities.");
			break;
		}
		case AQUARIUS: {
			JOptionPane.showMessageDialog(null, "You're often preoccupied by other people's lives. Your devotion to others will be appreciated today, Aquarius. For example, in the family circle, you may have to bandage everyone's little physical or psychological wounds. Don't neglect your energy needs. As you're aware, you need all the strength you can muster.");
			break;
		}
		case PISCES: {
			JOptionPane.showMessageDialog(null, "You may have some trouble getting out of bed today due to a desire to let the world carry on without your help for a while. Pisces, you can yield to that lazy urge today, for the aspects are likely to assist you in fulfilling your goals. Take advantage of some time off to rest or perhaps tidy your nest. You might want to make that bed, too.");
			break;
		}

		}
	}
	// 3. Make a main method to test your method

}
