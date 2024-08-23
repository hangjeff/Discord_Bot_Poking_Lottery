import os
import asyncio
import subprocess
import discord
from discord.ext import commands

def Run():
    try:
        if not os.path.exists('Poking_Lottery.jar'):
            subprocess.run(['script.bat'], shell=True)
        # execute jar file and capture output
        result = subprocess.check_output(['java', '-jar', 'Poking_Lottery.jar'])
        
        # bytes string to string
        result_str = result.decode('utf-8').strip()
        return result_str
    except subprocess.CalledProcessError as e:
        print(f"Error executing jar file: {e}")
        return None

def Edit_Emoji(getStr):
    emoji = getStr.split('#')[0: -1]
    result = ""
    for i in range(len(emoji)):
            result += '||' + emoji[i] + '||'
            if (i + 1) % 7 == 0:
               result += '\r\n'
    return result
        
def main():
    intents = discord.Intents.all()
    bot = commands.Bot(command_prefix = "/", intents = intents)
    
    
    
    @bot.event
    async def on_ready():
        print(f'Logged in as {bot.user}')
        await bot.change_presence(activity=discord.Game(name="Poking Lottery"))
    #Set the command
    @bot.command(name='pokinglottery')
    async def pokinglottery(ctx):
        getStr = Run()
        output = '# Play Poking Lottery\r\n'
        
        if getStr is not None:
            output += Edit_Emoji(getStr)
        await ctx.send(output)
    
    bot.run('Your Token')
        
if __name__ == '__main__':
    main()