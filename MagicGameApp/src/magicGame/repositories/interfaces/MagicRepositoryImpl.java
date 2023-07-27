package magicGame.repositories.interfaces;

import magicGame.models.magics.Magic;

import java.util.ArrayList;
import java.util.List;

import static magicGame.common.ExceptionMessages.INVALID_MAGIC_REPOSITORY;

public class MagicRepositoryImpl implements MagicRepository {
    private List<Magic> data;

    public MagicRepositoryImpl() {
        this.data = new ArrayList<>();
    }

    @Override
    public List<Magic> getData() {
        return data;
    }

    @Override
    public void addMagic(Magic model) {
        if (model == null) {
            throw new NullPointerException(INVALID_MAGIC_REPOSITORY);
        }
        data.add(model);
    }

    @Override
    public boolean removeMagic(Magic model) {
        if(data.contains(model)){
            data.remove(model);
            return true;
        }
        return false;
    }

    @Override
    public Magic findByName(String name) {
        for (Magic magicData : data) {
            if(magicData.getName().equals(name)){
                return magicData;
            }
        }
        return null;
    }
}
