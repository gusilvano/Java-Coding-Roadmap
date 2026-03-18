# **Text Arcade Game** - Text-Based Game Loop Simulation
This project implements a simple text-based game loop with the goal of simulating a dynamic combat scenario in which the player must continuously defeat enemies.

The main focus is the creation of a combo system, where the game encourages the player to perform long kill streaks through rewards.
## Mechanics
The game mechanics are based on:
- Player chooses the language.
- Game loop runs continuously as long as there are enemy kills.
- At each interaction, the code interprets whether there was a kill and how many.
- When reaching a predefined sequence of eliminations, the player receives a bonus.

The bonus system works as follows:
- Sequences greater than or equal to 10 eliminations grant an additional 500 bonus points.
- Sequences greater than or equal to 20 eliminations grant an additional 1000 bonus points.

## End Condition
The game ends immediately when the player fails to defeat any enemies, meaning the number of kills is zero.

## Conclusion
This project aims to develop fundamental programming concepts such as conditional structures, loops, score control, and language selection.