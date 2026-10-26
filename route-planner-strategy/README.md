# Route Planner (Strategy Pattern)

Assignment 5 for ShP-2216 Software Design Patterns, Astana IT University. A small Java 17 project that plans a route between two locations using interchangeable strategies for car, walking, cycling and public transport. The Navigator never checks which kind of transport is used, it only delegates to the strategy it currently holds.

## Structure

The code lives under src/main/java/navigation. The model package holds Location and Route. The strategy package holds the RouteStrategy interface and the four concrete strategies. The context package holds Navigator. The app package holds Main, which plays the role of the client. The report is in docs/report.md.

## Build and run

You need JDK 17 or newer. From the project root, compile and run with these commands.

```
mkdir out
javac -d out $(find src -name "*.java")
java -cp out navigation.app.Main
```

On Windows PowerShell use this for compiling.

```
mkdir out
javac -d out (Get-ChildItem -Recurse -Filter *.java src | ForEach-Object FullName)
java -cp out navigation.app.Main
```

In IntelliJ IDEA open the folder, mark src/main/java as Sources Root and run Main.

Expected output:

```
Bayterek Tower -> Astana IT University
Car                 6.50 km     9.8 min
Walk                5.50 km    66.0 min
Cycle               5.75 km    23.0 min
Public transport    6.25 km    23.0 min
```

## How to add a new strategy

Create a new class in the strategy package that implements RouteStrategy and returns a Route from buildRoute. Then add an instance of it where the client builds its list of strategies, for example in Main. No existing strategy and not the Navigator needs to be edited. PublicTransportStrategy was added exactly this way in a separate commit to demonstrate it.
