class Room(object): 

    def __init__(self, name, description):
        self.name = name
        self.description = description
        self.paths = {} 

    def go(self, direction):
        return self.paths.get(direction, None) 

    def add_paths(self, paths):
        self.paths.update(paths)


central_corridor = Room("Central Corridor","看看Room.go()什么意思")
laser_weapon_armory = Room("Laser Weapon Armory","看看add_paths()什么意思")
the_bridge = Room("The Bridge","Error 13是什么"")
escape_pod = Room("Escape Pod","学过的都忘了 (⊙﹏⊙)")
the_end_winner = Room("The End","object of type function is not json serializable")
the_end_loser = Room("The End", "object of Room function is not json serializable")

escape_pod.add_paths({  
    '2': the_end_winner,  
    '*': the_end_loser  
})

generic_death = Room("death","浪费了四个小时找错误，发现是引号和括号每加")

the_bridge.add_paths({  
    'throw the bomb': generic_death,  
    'slowly place the bomb': escape_pod  
})  
laser_weapon_armory.add_paths({  
    '0132': the_bridge,  
    '*': generic_death  
})  
central_corridor.add_paths({  
    'shoot!': generic_death,  
    'dodge!': generic_death,  
    'tell a joke': laser_weapon_armory  
})  
START = 'central_corridor'

def load_room(name):
    """
    There is a potentional security problem here.
    Who gets to set name? Can that expose a variable?
    """
    return globals().get(name)

def name_room(room):
    for key, value in globals().items():
        if value == room:
            return key