function CheckEven(No)
{
    if(No % 2 == 0)
    {
        return true;
    }
    else
    {
        return false;
    }
}

function main()
{
    let Value = 11
    let bret = false

    bret = CheckEven(Value)

    if(bret == true)
    {
        console.log(`${Value} is even number`);
    }
    else
    {
        console.log(`${Value} is odd number`);
    }
}

main()