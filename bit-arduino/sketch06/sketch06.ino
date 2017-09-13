int buttonPin = 2;
int ledPin = 4;

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
  Serial.println(count);
  if (digitalRead(buttonPin) == HIGH) {
    count++;
  } else {
    count = 0;
  }
  if (count > 5) {
    Serial.println("do reset");
  }  
}

void toggleLed(unsigned long currMillis) {
  static int state = LOW;
  static unsigned long savedMillis = 0;
  
  if (currMillis < savedMillis + 100)
    return;
    
  savedMillis = currMillis;  
  if (state == LOW) {
    state = HIGH;
  } else {
    state = LOW;
  }
  digitalWrite(ledPin, state);
}

