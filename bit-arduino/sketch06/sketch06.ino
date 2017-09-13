int buttonPin = 2;
int ledPin = 4;
boolean buttonPressed = false;
boolean reset = false;

void setup() {
  Serial.begin(9600);  
  pinMode(buttonPin, INPUT);
  pinMode(ledPin, OUTPUT);
}

void loop() {
  unsigned long currMillis = millis();

  detectButtonSignal(currMillis);
  toggleLed(currMillis);

  if (Serial.available()) {
    String cmd = Serial.readString();
    if (cmd == "reset") {
      Serial.println(reset);
      reset = false;
    }
  }
  delay(10);
}

void detectButtonSignal(unsigned long currMillis) {
  static int count = 0;
  static unsigned long savedMillis = 0;
  
  if (reset || currMillis < savedMillis + 1000)
    return;

  savedMillis = currMillis;
  if (digitalRead(buttonPin) == HIGH) {
    count++;
    buttonPressed = true;
  } else {
    count = 0;
    buttonPressed = false;
  }
  if (count > 5) {
    reset = true;
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

