public class BridgePattern {

        interface Device {
            void turnOn();
            void turnOff();
        }

        static class TV implements Device {
            public void turnOn()
            {
                System.out.println("TV is ON");
            }
            public void turnOff()
            {
                System.out.println("TV is OFF");
            }
        }

        static class DVDPlayer implements Device {
            public void turnOn()
            {
                System.out.println("DVD Player is ON");
            }
            public void turnOff()
            {
                System.out.println("DVD Player is OFF");
            }
        }

        static class RemoteControl {
            private Device device;
            public RemoteControl(Device device)
            { this.device = device; }
            public void PowerButton()
            { device.turnOn(); }
            public void PowerOffButton()
            { device.turnOff(); }
        }

        public static void main(String[] args) {
            RemoteControl tvRemote = new RemoteControl(new TV());
            RemoteControl dvdRemote = new RemoteControl(new DVDPlayer());

            tvRemote.PowerButton();
            tvRemote.PowerOffButton();

            dvdRemote.PowerButton();
            dvdRemote.PowerOffButton();
        }
    }


