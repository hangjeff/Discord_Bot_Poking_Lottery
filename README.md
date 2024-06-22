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
2. Click on *script.bat* to compile the java file and create the jar archive
3. Create your own discord bot
 * **Remember to set the Intents**  
     ![image](https://github.com/hangjeff/Discord_Bot_Poking_Lottery/assets/163969474/8a449f12-2fb8-4499-b4e9-fec219c18e85)
4.  Add the bot to your discord server
5. Install the required Python packages
   ``pip install asyncio``
   ``pip install discord.py``
6. Change ``bot.run()`` on line 46 of *main.py* to your bot's token
7. Click on *main.py* to activate the bot
8. send command ``/pokinglottery`` to play the plking lottery
 * Example:  
      ![image](https://github.com/hangjeff/Discord_Bot_Poking_Lottery/assets/163969474/821e1b67-2402-4328-b9d2-bf2a8a715b80)
9. Click on those black blocks sent by the bot until you find the special emoji  
 ![image](https://github.com/hangjeff/Discord_Bot_Poking_Lottery/assets/163969474/8b574b49-d139-44b3-b95b-438aea758081)

