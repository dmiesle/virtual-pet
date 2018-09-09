 -Virtual Pet Functions -
Food Level(Pet.feed, Pet.consume = value 0-10 (0-dead, 1-starving, 2-hangry, 3-hungry, 4-peckish, 5-satisfied, 6-content, 7-full, 8-stuffed, 9-bloated, 10-lethargic
1-3 & 8-10 - lose -5 xp for training and entertainment

Entertained (Pet.attend, Pet.neglect) = value 1-5 (1-bored, 2-restless, 3-content, 4-happy, 5-overstimulated)
1 & 5 - no option to train, entertainment -10 xp
4 - =5 xp from entertainment or training

Rested (Pet.sleep, Pet.active) = value 1-5 (1-delirious, 2-exhausted, 3- tired, 4-rested, 5-well rested)
1 - -10xp for training and entertainment
2- -5 xp for training and entertainment
Training (Pet.learn) = increase pet experience based on options 
+10 XP
Leveled (Pet.levelup) = value 1-10 (10 is max level)
100Xp = +1 level

Experience = value 1-100 (100=+1 level)

Life = value 0-1 (0-dead, 1-alive)
If foodLevel =0 pet dies


- Virtual Pet Features -
Name - String
Level - Dictated by function starts at 1
Type - Basic, Curious, hungry, high maintenance, lazy, laid-back, 

Basic - no changes
Curious - gets 20 xp for training, 5 xp for playing
Hungry - consumes 2 food when fed
High maintenance - will loose 2 rested if not entertained every 3 ticks
Lazy - Training costs 2 food instead of 1, Entertained increases rested 1
Laid-back - gets +1 food with no negatives over 7

- Resources -
Food - increases by 1 every 3 ticks, starts at 5
