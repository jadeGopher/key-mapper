# Key mapper
Introducing you simple app that allows to bind keys on your remote to run specific apps or do othe
r stuff

# How to run
- Install this app on your Android TV;
- Go to accessibility settings and enable key mapper accessibility service;
- Enjoy.

# How to change functionality
You can adjust functionality by editing `override fun onKeyEvent(event: KeyEvent?): Boolean` 
function of `Mapper` class. Just log id of buttons and edit `onKeyEvent` function body for your own 
needs.

# How to set up working environment
- Enable developer mode on your TV; 
- Allow debugging via usb;
- Install adb client on your computer;
- Open Android Studio IDE and write `adb connect {{ ip_address_of_your_TV }}` command in terminal;
- You are all set.
