int buttonPin = 2;
int ledPin = 4;
boolean buttonPressed = false;

void setup() {
  Serial.begin(9600);  
  pinMode(buttonPin, INPUT);
  pinMode(ledPin, OUTPUT);
}

void loop() {
  unsigned long currMillis = millis();

  detectButtonSignal(currMillis);
  toggleLed(currMillis);

  delay(10);
}

void detectButtonSignal(unsigned long currMillis) {
  static int count = 0;
  static unsigned long savedMillis = 0;
  
  if (currMillis < savedMillis + 1000)
    return;

  savedMillis = currMillis;
  if (digitalRead(buttonPin) == HIGH) {
    count++;
    if (count < 5) {
      buttonPressed = true; // LED 깜박 거려라!
    } else if (count == 5) {
      buttonPressed = false; // LED 깜박 거리지 말라!
      Serial.println("reset:1");
    }
  } else {
    count = 0;
    buttonPressed = false;
  }
}

void toggleLed(unsigned long currMillis) {
  static int state = LOW;
  static unsigned long savedMillis = 0;
  
  if (currMillis < savedMillis + 100)
    return;
    
  savedMillis = currMillis;  
  if (state == LOW && buttonPressed) {
    state = HIGH;
  } else {
    state = LOW;
  }
  digitalWrite(ledPin, state);
}

