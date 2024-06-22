# Discord_Bot_Poking_Lottery
**A discord bot that you can use a command to play poking lottery**

## Instruction
1. Edit *data.csv*:
   * It has two columns:
     *Emoji* and *Special*
      The emojis in the Emoji column will be generated multiple times, while Special refers to being generated once (the         numbers stored in Special correspond to the Emoji column)
   * Example:  
      ![image](https://github.com/hangjeff/Discord_Bot_Poking_Lottery/assets/163969474/d90186a8-3958-48f0-a384-ed0399561a0b)  
        **The value 1 in Special corresponds to :zero:, so :zero: will be generated once**  
        **If you change the value from 1 to 4 in Special, it will be :three:**
2. Create your own discord bot
   * **Remember to set the Intents**  
     ![image](https://github.com/hangjeff/Discord_Bot_Poking_Lottery/assets/163969474/8a449f12-2fb8-4499-b4e9-fec219c18e85)
3.  Add the bot to your discord server
4. Install the required Python packages
   ``pip install asyncio``
   ``pip install discord.py``
5. Change ``bot.run()`` on line 49 of *main.py* to your bot's token
6. Click on *main.py* to activate the bot
   * ** *main.py* will execute *script.bat* to create a JAR file. Set up the environment variables for Java and JAR first**
7. Send command ``/pokinglottery`` to play the plking lottery
   * Example:  
      ![image](https://github.com/hangjeff/Discord_Bot_Poking_Lottery/assets/163969474/821e1b67-2402-4328-b9d2-bf2a8a715b80)
8. Click on those black blocks sent by the bot until you find the special emoji  
 ![image](https://github.com/hangjeff/Discord_Bot_Poking_Lottery/assets/163969474/8b574b49-d139-44b3-b95b-438aea758081)

